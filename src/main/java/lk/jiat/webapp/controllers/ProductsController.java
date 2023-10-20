package lk.jiat.webapp.controllers;

import jakarta.servlet.http.HttpServletRequest;
import jakarta.ws.rs.*;
import jakarta.ws.rs.core.Context;
import jakarta.ws.rs.core.MediaType;
import jakarta.ws.rs.core.Response;
import lk.jiat.webapp.dto.ProductDTO;
import lk.jiat.webapp.entity.Product;
import lk.jiat.webapp.service.ProductService;
import org.glassfish.jersey.server.mvc.Viewable;

import java.util.ArrayList;
import java.util.List;

@Path("/products")
public class ProductsController {

    @GET
    public Viewable index(){
        ProductService productService = new ProductService();
        List<Product> products = productService.getAllProducts();

        return new Viewable("/frontend/products",products);
    }

    @POST
    @Path("add_product")
    public Response addProductAction(Product product){

        if(product.getTitle().isEmpty()){
            return Response.ok().entity("Please enter the product title").build();
        } else if(product.getPrice() < 1){
            return Response.ok().entity("Please enter price").build();
        } else {

            ProductService productService = new ProductService();
            productService.saveProduct(product);
            return Response.ok().entity("success").build();
        }
    }

    @POST
    @Path("search_product")
    public Viewable searchProduct(@Context HttpServletRequest request){

        String title = request.getParameter("title");

        List<ProductDTO> list = new ArrayList<>();

        ProductService productService = new ProductService();

        List<Product> products = productService.searchByTitle(title);

        return new Viewable("/frontend/products_table_view", products);
    }

    @DELETE
    @Path("delete_product")
    public Response deleteProductAction(Product product){

       ProductService productService = new ProductService();

        Product byProductId = productService.getByProductId(product.getId());

        if(byProductId != null){
            productService.deleteProduct(byProductId);
            return Response.ok().entity("success").build();
        } else {
            return Response.ok().entity("Something went wrong.").build();
        }
    }

    @GET
    @Path("edit_product")
    public Viewable editProductAction(@Context HttpServletRequest request){

        String pid = request.getParameter("pid");

        ProductService productService = new ProductService();

       Product byProductId = productService.getByProductId(Long.parseLong(pid));

       return new Viewable("/frontend/product_update",byProductId);
    }
}
