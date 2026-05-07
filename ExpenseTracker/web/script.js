function addExpense() {

    const title = document.getElementById("title").value;
    const category = document.getElementById("category").value;
    const amount = document.getElementById("amount").value;

    fetch("http://localhost:8080/addExpense", {

        method: "POST",

        headers: {
            "Content-Type": "application/json"
        },

        body: JSON.stringify({
            title: title,
            category: category,
            amount: amount
        })
    })
    .then(response => response.text())
    .then(data => {

        document.getElementById("message").innerText = data;

        document.getElementById("title").value = "";
        document.getElementById("category").value = "";
        document.getElementById("amount").value = "";
    });
}