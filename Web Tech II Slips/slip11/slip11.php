<!--11)Write an Ajax program to print a text file. (15 marks)-->

<!DOCTYPE HTML>
<html>
<head>
<title>Untitled Document</title>
<script language="javascript">
function hello()
{
    var xhttp=new XMLHttpRequest();;
    xhttp.onreadystatechange=function()
    {
    if (this.readyState==4 && this.status==200){
    document.getElementById("myDiv").innerHTML=this.responseText;
    }             
    }
xhttp.open("GET","slip11.txt",true);
xhttp.send();
}
</script>
</head>
<body>
<form name="myform">
    <p id="myDiv"></p>
    <input type="button" onClick="hello()" value="Click me">
</form>
</body>
</html>