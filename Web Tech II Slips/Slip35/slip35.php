<!-- 35)Write a PHP program to read an XML file called “books.xml” and print the contents of the file. The books.xml file has details of books such as title, author, year, publisher. This books database in the xml file has the following structure:
<library>
	<book>
		<title>…… </title>
		<author>…… </author>
		<year>……. </year>
		<publisher>….. </publisher>
	</book>
	<book>……. </book>
</library>			 -->

<?php
$xml = simplexml_load_file('books.xml');
echo '<h2>Loaded from books.xml</h2>';
$list = $xml->book;
for ($i = 0; $i < count($list); $i++) {
    echo '<b>Title:</b> ' . $list[$i]->title . '<br>';
    echo 'Author: ' . $list[$i]->author . '<br>';
    echo 'Year: ' . $list[$i]->year . '<br>';
    echo 'Publisher: ' . $list[$i]->publisher . '<br><br>';
}
