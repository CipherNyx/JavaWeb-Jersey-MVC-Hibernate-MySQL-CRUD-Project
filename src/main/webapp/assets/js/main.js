function login(){

    let username = document.getElementById("username");
    let password = document.getElementById("password");

    fetch('login',{
        headers:{
            'Content-type':'application/json'
        },
        method:"POST",
        body:JSON.stringify({
            username:username.value,
            password:password.value,
        }),
    })
        .then(response => response.text())
        .then((text)=>{
            if(text === "success"){
                alert("Login Successful");
                document.location = BASE_URL;
            } else {
                alert(text);
            }
        });
}

function register(){

    let username = document.getElementById("username");
    let password = document.getElementById("password");

    fetch('register',{
        headers:{
            'Content-type':'application/json'
        },
        method:"POST",
        body:JSON.stringify({
            username:username.value,
            password:password.value,
        }),
    })
        .then(response => response.text())
        .then((text)=>{
            if(text === "success"){
                alert("Register Successful");
                document.location.reload();
            } else {
                alert(text);
            }
        });
}

function deleteUser(userId){
    fetch('delete',{
        headers:{
            'Content-type':'application/json'
        },
        method:"POST",
        body:JSON.stringify({
            id:userId,
        }),
    })
        .then(response => response.text())
        .then((text)=>{
            if(text === "success"){
                alert("User Successfully Deleted");
                document.location.reload();
            } else {
                alert(text);
            }
        });
}

function addProduct(){

    let product_title = document.getElementById("product_title");
    let product_price = document.getElementById("product_price");

    fetch('products/add_product',{
        headers:{
            'Content-type':'application/json'
        },
        method:"POST",
        body:JSON.stringify({
            title:product_title.value,
            price:product_price.value,
        }),
    })
        .then(response => response.text())
        .then((text)=>{
            if(text === "success"){
                alert("Product Added Successfully");
                document.location.reload();
            } else {
                alert(text);
            }
        });
}

function deleteProduct(productId){
    fetch('products/delete_product',{
        headers:{
            'Content-type':'application/json'
        },
        method:"DELETE",
        body:JSON.stringify({
            id:productId,
        }),
    })
        .then(response => response.text())
        .then((text)=>{
            if(text === "success"){
                alert("Product Successfully Deleted");
                document.location.reload();
            } else {
                alert(text);
            }
        });
}

function editProduct(productId){
    document.location = BASE_URL + "products/edit_product?pid="+productId;
}

function updateProduct(id){

    let update_product_title = document.getElementById("update_product_title");
    let update_product_price = document.getElementById("update_product_price");

    fetch('update_product',{
        headers:{
            'Content-type':'application/json'
        },
        method:"PUT",
        body:JSON.stringify({
            id:id,
            title:update_product_title.value,
            price:update_product_price.value,
        }),
    })
        .then(response => response.text())
        .then((text)=>{
            if(text === "success"){
                alert("Product Updated Successfully");
                document.location = BASE_URL + "products";
            } else {
                alert(text);
            }
        });
}

function productSearch(){

    let product_title = document.getElementById('product_search').value;

    fetch('products/search_product?title='+product_title,{
        method:"POST",
    })
    .then(response => response.text())
    .then((data)=>{
        let product_view_table = document.getElementById("product_view_table");
        product_view_table.innerHTML = data;
    });
}