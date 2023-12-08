
// for checking email and password
function validate(){
    var username = document.getElementById("userEmail");
    var password = document.getElementById("userPass");

    if ( username == "sutanughosal1@gmail.com" && password == "sutanu123"){
        alert ("Login successfull");
        window.location.href = "https://www.google.com"; // Redirecting to other page.
        return false;
    }

    else
    {
        window.location.href = "userReg.html";
        return false;
    }
}

// for checking user page
userButton.onclick = userFunc;
function userFunc() {
    alert("Hello");
    window.location.href="https://www.google.com";
}