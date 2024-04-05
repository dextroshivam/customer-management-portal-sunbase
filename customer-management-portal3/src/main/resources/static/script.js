let addCustomerContainer = document.getElementById("add-customer-container");
// let body = document.getElementsByTagName("body")[0];
let cancelButton=document.getElementById("cancel-button");
let cmpContainer=document.getElementById("cmp-container");


function createCustomer() {
    addCustomerContainer.style.display = "block";
    cmpContainer.style.opacity = "0.5";
    // addCustomerContainer.style.opacity = "1";
}

cancelButton.addEventListener("click",()=>{
    addCustomerContainer.style.display = "none";
    cmpContainer.style.opacity = "1";
})