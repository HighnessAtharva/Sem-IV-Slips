<!-- 22)Write class declarations and member function definitions for an employee(code, name, designation). Design derived classes as emp_account(account_no, joining_date) from employee and emp_sal(basic_pay, earnings, deduction) from emp_account. Write a menu driven program
a. to build a master table
b. to sort all entries
c. to search an entry
d. Display salary.	 -->

<html>
    <head>
    <link rel="stylesheet" href="style/style.css">
    </head>
    <body>
        <div >
            <div >
                <div >
                    <h4>Select following Options</h4><br>
                    <form action="#" method="post">
                        <input type="radio" name="r1" value="1" class=""> Master table<br>
                        <input type="radio" name="r1" id="" value="2"> Sorting By Emp_Code <br>
                        <div>
                    
                            <input type="radio" name="r1" value="3"> Search By Name</label>
                            <div class="col-sm-6">
                                <input type="text" name="nm" class="form-control">
                            </div>
                        </div>
                        <input type="radio" name="r1" id="" value="4"> Display Salary <br><br>
                        <input type="submit" value="Submit" name="submit">
                        <input type="reset" value="Clear">
                    </form>
                </div>
                <div class="col-md-7">

<?php
if (isset($_POST['submit'])) {
    class employee
    {
        public $code, $name, $des;
        function __construct($a, $b, $c)
        {
            $this->code = $a;
            $this->name = $b;
            $this->des = $c;
        }
        function disemp()
        {
            echo "<td>" . $this->code . "</td><td>" . $this->name . "</td><td>" . $this->des . "</td>";
        }
        function getName()
        {
            return $this->name;
        }
    }
    class emp_acc extends employee
    {
        public $ano, $jdate;
        public function __construct($a, $b, $c, $d, $e)
        {
            parent::__construct($a, $b, $c);
            $this->ano = $d;
            $this->jdate = $e;
        }
        public function disacc()
        {
            echo "<td>" . $this->ano . "</td><td>" . $this->jdate . "</td>";
        }
    }
    class emp_sal extends emp_acc
    {
        public $bs, $earn, $ded, $total;
        public function __construct($a, $b, $c, $d, $e, $f, $g, $h)
        {
            parent::__construct($a, $b, $c, $d, $e);
            $this->bs = $f;
            $this->earn = $g;
            $this->ded = $h;
            $this->total = $this->bs + $this->earn - $this->ded;
        }
        public function dissal()
        {
            echo "<td>" . $this->bs . "</td><td>" . $this->earn . "</td><td>" . $this->ded . "</td><td>" . $this->total . "</td>";
        }
    }
    $e1[0] = new emp_sal(1, "Akash", "HOD", 10001, "02/02/2009", 30000, 1000, 200);
    $e1[1] = new emp_sal(2, "Akash", "HOD", 10002, "12/10/2012", 29000, 3500, 400);
    $e1[2] = new emp_sal(3, "Ramesh", "HOD", 10003, "18/11/2013", 24000, 2500, 250);
    $e1[3] = new emp_sal(4, "Swara", "HOD", 10004, "19/05/2015", 21000, 3000, 650);
    $e1[4] = new emp_sal(5, "Priya", "HOD", 10005, "26/07/2017", 27000, 4000, 750);

    $ch = $_POST['r1'];
    $nm = $_POST['nm'];
    $flag = 0;

    function mastertable($e1)
    {
        echo "<table class='table'>
    <tr><thead class='thead-dark'><th>Emp code</th>
    <th>Emp Name</th><th>Designation</th>
    <th>Account No</th><th>Joining Date</th>
    <th>Basic Pay</th><th>Earning</th>
    <th>Deduction</th><th>Total Salary</th></thead></tr>";
        for ($i = 0; $i < 5; $i++) {
            echo "<tr>";
            $e1[$i]->disemp();
            $e1[$i]->disacc();
            $e1[$i]->dissal();
            echo "</tr>";
        }
        echo "</table>";
    }
    switch ($ch) {
        case 1:mastertable($e1);
            break;
        case 2:echo "Sorted details <br>";
            function srt($a, $b){
                return strcmp($a->code, $b->code);
            }
            mastertable($e1);
            usort($e1, "srt");
            break;
        case 3:
            for ($i = 0; $i < 5; $i++) {
                $t = $e1[$i]->getName();
                if ($t == $nm) {
                    $flag = 1;
                    break;
                }
            }
            if ($flag == 0) {
                echo "<div class='alert alert-danger' role='alert'>
                        <em>Name Not Found</em>
                      </div>";
            } else {
                echo "<div class='alert alert-success' role='alert'>
                        <em>Name Found</em>
                      </div>";
            }
            break;
        case 4:echo "Display Salary <br>";
            echo "<table class='table'>
                    <tr>
                    <thead class='thead-dark'>
                        <th>Emp Name</th>
                        <th>Basic Pay</th>
                        <th>Earning</th>
                        <th>Deduction</th>
                        <th>Total Salary</th>
                    </tr>";
            for ($i = 0; $i < 5; $i++) {
                echo "<tr> <td> ";
                $e1[$i]->getName();
                echo "</td>";
                $e1[$i]->dissal();
            }
            echo "</tr></table>";
            break;
    }
}
?>
                </div>
            </div>
        </div>
    </body>
</html>