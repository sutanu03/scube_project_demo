// for checking email and password
//login page

function validateForm() {
  let username = document.forms["loginForm"]["a_email"].value;
  let password = document.forms["loginForm"]["g_password1"].value;

  let user = $("#txtEmail").val();
  //alert(user);

  if (username == "sutanughosal1@gmail.com" && password == "sutanu123") {
    alert("Login successfull");
    //window.location.href = "https://www.google.com"; // Redirecting to other page.
    window.location.href = "dashboard.html";
    return false;
  } else {
    alert("Username or password doesn't exist!");
    //window.location.href = "userReg.html";
    return false;
  }
}

// open popup login in home pageBreakAfter:

function showModal() {
  document.querySelector(".overlay").classList.add("show-overlay");
  document.querySelector(".login-form").classList.add("show-login-form");
}

function closeModal() {
  document.querySelector(".overlay").classList.remove("show-overlay");
  document.querySelector(".login-form").classList.remove("show-login-form");
}

let spanVar = document.querySelector(".span-cross");
spanVar.addEventListener("click", closeModal);

// ajax for new reg page

$(document).ready(function () {
  $("#signUp").on("click", function () {
    /* $(this).load("userReg.html", function () {
      alert("Register Yourself");
    });*/
    document.querySelector(".overlay").classList.add("show-overlay");

    document.querySelector(".reg-form").classList.add("show-reg-form");
    function closeModal1() {
      document.querySelector(".overlay").classList.remove("show-overlay");
      document.querySelector(".reg-form").classList.remove("show-reg-form");
    }

    let spanVar2 = document.querySelector("#num2");
    spanVar2.addEventListener("click", closeModal1);
  });
});

/* 
saving 
form 
data 
into 
database
*/
/*
const formEl = document.querySelector(".regForm");

formEl.addEventListener("submit", (event) => {
  event.preventDefault();

  const formData = new FormData(formEl);
  const data = new URLSearchParams(formData);

  fetch("http://localhost:8088/api/add", {
    method: "POST",
    body: data,
  })
    .then((res) => res.json())
    .then((data) => console.log(data))
    .catch((error) => console.log(error));
});
*/

/* 
giving
alert
after
submitting
form
*/

$("#regForm").submit(function (e) {
  e.preventDefault();

  // do ajax now
  alert("Your account has been created");
  console.log("submitted");
});
