fetch("http://localhost:8050/api/primoctrl/nomecorso")
.then(response =>{
    return response.text();
})
.then(data =>{
    console.log(data);
    document.querySelector("#demo").innerHTML = data;
})

fetch("http://localhost:8050/api/primoctrl/Luca")
.then(response =>{
    return response.json();
})
.then(data =>{
    console.log(data);
    document.querySelector("#salutiUsers").textContent = data;
})