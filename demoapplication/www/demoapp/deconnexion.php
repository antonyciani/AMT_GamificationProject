<?php
// Start the session
session_start();
?>
<!DOCTYPE html>
<html>
<body>
<?php
session_unset();
session_destroy();
header('Location: index.php');

exit();
?>


</body>
</html>