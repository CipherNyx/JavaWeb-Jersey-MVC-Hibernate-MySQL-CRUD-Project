package lk.jiat.webapp.controllers;

import jakarta.ws.rs.POST;
import jakarta.ws.rs.PUT;
import jakarta.ws.rs.Path;
import jakarta.ws.rs.core.Response;
import lk.jiat.webapp.entity.Product;
import lk.jiat.webapp.service.ProductService;

@Path("/products/update_product")
public class ProductsUpdateController {

    @PUT
    public Response updateProductAction(Product product){

        if(product != null){
            ProductService productService = new ProductService();
            productService.updateProduct(product);

            return Response.ok().entity("success").build();
        } else {
            return Response.ok().entity("Something went wrong.").build();
        }
    }
}
