<!-- Write a PHP program to create a calculator that will display the addition, subtraction, division and multiplication symbols and will print the result for two numbers accepted from the user by selecting any operation from the menu. -->

<?php
$result = "";
class calculator
{
    public $a;
    public $b;

    public function checkopration($oprator)
    {
        switch ($oprator) {
            case '+':
                return "Addition: ". $this->a + $this->b;
                break;

            case '-':
                return "Subtraction: ". $this->a - $this->b;
                break;

            case '*':
                return "Multiplication: ". $this->a * $this->b;
                break;

            case '/':
                return "Division: ". $this->a / $this->b;
                break;

            default:
                return "Sorry No command found";
        }
    }
    public function getresult($a, $b, $c)
    {
        $this->a = $a;
        $this->b = $b;
        return $this->checkopration($c);
    }
}

$cal = new calculator();
if (isset($_POST['submit'])) {
    $result = $cal->getresult($_POST['n1'], $_POST['n2'], $_POST['op']);
}
?>

<form method="post">
<table align="center">
    <tr>
        <td><strong><?php echo $result; ?><strong></td>
    </tr>
    <tr>
        <td>Enter 1st Number</td>
        <td><input type="number" name="n1"></td>
    </tr>

    <tr>
        <td>Enter 2nd Number</td>
        <td><input type="number" name="n2"></td>
    </tr>

    <tr>
        <td>Select Oprator</td>
        <td><select name="op">
            <option value="+">+</option>
            <option value="-">-</option>
            <option value="*">*</option>
            <option value="/">/</option>
        </select></td>
    </tr>

    <tr>
        <td></td>
        <td><input type="submit" name="submit" value="                =                "></td>
    </tr>

</table>
</form>