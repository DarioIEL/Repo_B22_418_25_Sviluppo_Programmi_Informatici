fetch("http://localhost:8080/api/libri")
.then(response =>{
    return response.json()
})
.then(data =>{
    console.log(data);
    
})

class Libro{
    constructor(titolo, autore, prezzo){
        this.titolo = titolo;
        this.autore = autore;
        this.prezzo = prezzo;
    }
}

function inserisciLibro(libro){

    let nuovoLibro = new Libro(libro.titolo, libro.autore, libro.prezzo);

    fetch("http://localhost:8080/api/libri", {
        method: "POST",
        headers: {
            'Content-Type': 'application/json'
        },
        body: JSON.stringify(nuovoLibro)
    })
    .then(response => response.json())
    .then(data => console.log(data))
    .catch(error => console.error(error));
}


document.querySelector("#btn").addEventListener("click", ()=>{
    let libro = new Libro("Baudolino", "Umberto Eco", 13.8);
    inserisciLibro(libro);
})


