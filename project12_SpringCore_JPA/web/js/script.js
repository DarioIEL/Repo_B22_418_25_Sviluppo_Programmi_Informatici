class Libro{
    /**
     * 
     * @param {String} titolo 
     * @param {Number} prezzo 
     * @param {String[]} autori 
     */
    constructor( titolo, prezzo, autori){

        this.titolo = titolo;
        this.prezzo = prezzo;
        this.autori = autori;
    }
}

const formRicerca = document.querySelector("#formRicerca");

function cercaAutore(event){
    event.preventDefault();
    let cognomeAutore = document.querySelector("#cognome").value;
    console.log(cognomeAutore);   
    fetch(`http://localhost:8080/api/libri/cerca/autore?cognome=${cognomeAutore}`)
    .then(response => {
        return response.json();
    })
    .then(data => {
        //data è un array di libri
        let libri = data;
        [...libri].forEach(libro => {
            creaCard(libro);}
        )
    }
    )
}


/**
 * 
 * @param {Libro} libro 
 */
function creaCard(libro){
    console.log(libro);
    
    let card = document.createElement("div");
    card.setAttribute("class", "card");
    let h2Titolo = document.createElement("h2");
    h2Titolo.textContent = libro.titolo;
    card.appendChild(h2Titolo);

    
    libro.autori.forEach(autore => {
        let pAutore = document.createElement("p");
        pAutore.textContent = autore.nome + " " + autore.cognome;
        card.appendChild(pAutore);
    })
    
    document.querySelector("#demo").appendChild(card);
}
formRicerca.addEventListener("submit", cercaAutore);


function creaLibro(event){
    event.preventDefault();
    let inputs = document.querySelectorAll("#formInserimentoLibro input");
    [...inputs].forEach(input => { console.log(input.value);})
}

document.querySelector("#formInserimentoLibro").addEventListener("submit", creaLibro);

