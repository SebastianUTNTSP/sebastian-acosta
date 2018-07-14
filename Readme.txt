Topic 3 Carrito Service Java 8
Carrito Service Works like an API rest via a CarroController where the mapping for url is determined
In this service we used several methods for a shopping cart loading products.


By default the API starts with a list of Carts with one Cart
Giving the user a chance to make more if desire


List<Carros> cartList{ new Carro}

This is the main methods showing the user all carts with the products of each cart in it
List<Carro> getCarrosList(){
//Returns cartList

addCarro(){
//Make a new Cart and add it to the list
}


//Removes carts by id(cartList id)

removeCarro(int id){
//checks if it is possible to remove the parameter id in cartList
//Does it if possible
//If not does nothing
}


//Getting Carts by Id
public Carro getCarro(int id){
//It looks for the List of Carts and check their Id if it matches with the id required it provides said cart
// if it does returns the cart specified
}

PRODUCTS METHODS
Each cart has product list in it , this API also has methods to add remove check and purchase products

It's important to say that each cart when created starts with an empty list of products
That's why the reason that all product methods have id its because the API needs to know in what Cart its working

//Adds product using the name of the product

addProduct(int id , String name){
//Gets the cart sent by id using a for statment
//Adds the product name , price, id to the productList on the Cart
}

//Removes product

deleteProduct(int id, String name){
//Search the cart first by id, then look for the name of the product to match with the name in parameter
//If it matches its deleted
//If not does nothing
}

//GetProductList 
getProductList(int id){
//Search cart By id then return a ResponseEntity.ok with the respective productList
//else return a ResponseEntity.notFound
}


//Purchase Carro 
closeCarro(int id){
//Search by for statment the Cart id, if it matches and the productlist on that cart isn't 0
//Creates a new ArrayList 
//By for statment iterates in the product list adding names and price of products
//Also a double variable accumulate the total amount and when the for statments finish adding products it add "total
//and the total ammount
// then returns a responseEntity.ok with the new arraylist showing products name and its value with a total price at the end
// if id doesnt match or the productlist its 0(its empty) it returns a responeEntity.notFound
}


