fetch("http://localhost:8080/libri")
.then(response =>{
    return response.json()
})
.then(data =>{
    console.log(data);
    
})