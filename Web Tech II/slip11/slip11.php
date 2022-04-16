<!--11)Write an Ajax program to print a text file. (15 marks)-->

<!DOCTYPE HTML>
<html>
<head>
<title>Untitled Document</title>
<script language="javascript">
function hello()
{
    var xmlhttp;
    xmlhttp=new XMLHttpRequest();
    xmlhttp.onreadystatechange=function()
    {
    if (xmlhttp.readyState==4 && xmlhttp.status==200){
    document.getElementById("myDiv").innerHTML=xmlhttp.responseText;
    }             
    }
xmlhttp.open("GET","slip11.txt",true);
xmlhttp.send();
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