//AlertDialog
@Composable
fun AlertDialogExample() {
    var showDialog by remember { mutableStateOf(true) }

    if (showDialog) {
        AlertDialog(
            onDismissRequest = { showDialog = false },
            title = { Text("AlertDialog Title") },
            text = { Text("This is the body of the AlertDialog.") },
            confirmButton = {
                Button(onClick = { showDialog = false }) {
                    Text("OK")
                }
            }
        )
    }
}
//Card
@Composable
fun CardExample() {
    Card(
        modifier = Modifier.padding(8.dp),
        elevation = 4.dp
    ) {
        Text("Card Content", modifier = Modifier.padding(16.dp))
    }
}
//Checkbox
@Composable
fun CheckboxExample() {
    var checked by remember { mutableStateOf(false) }

    Row(Modifier.padding(8.dp)) {
        Checkbox(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Text("Checkbox", modifier = Modifier.padding(start = 8.dp))
    }
}
//FloatingActionButton
@Composable
fun FloatingActionButtonExample() {
    Scaffold(
        floatingActionButton = {
            FloatingActionButton(onClick = {}) {
                Text("+")
            }
        }
    ) {
        Text("FAB Example", Modifier.padding(16.dp))
    }
}
//Icon
@Composable
fun IconExample() {
    Icon(
        Icons.Default.Favorite,
        contentDescription = "Favorite",
        modifier = Modifier.padding(16.dp)
    )
}
//Image
@Composable
fun ImageExample() {
    Image(
        painter = painterResource(id = R.drawable.example_image),
        contentDescription = "Example Image",
        modifier = Modifier.fillMaxWidth()
    )
}
//ProgressBar
@Composable
fun ProgressBarExample() {
    CircularProgressIndicator(
        modifier = Modifier.padding(16.dp),
        progress = 0.75f
    )
}
//RadioButton
@Composable
fun RadioButtonExample() {
    var selected by remember { mutableStateOf(false) }

    Row(Modifier.padding(8.dp)) {
        RadioButton(
            selected = selected,
            onClick = { selected = !selected }
        )
        Text("RadioButton", modifier = Modifier.padding(start = 8.dp))
    }
}
//Slider
@Composable
fun SliderExample() {
    var value by remember { mutableStateOf(0.5f) }

    Slider(
        value = value,
        onValueChange = { value = it },
        modifier = Modifier.padding(16.dp)
    )
}
//Spacer
@Composable
fun SpacerExample() {
    Column {
        Text("Text 1")
        Spacer(modifier = Modifier.height(16.dp))
        Text("Text 2")
    }
}
//Switch
@Composable
fun SwitchExample() {
    var checked by remember { mutableStateOf(false) }

    Row(Modifier.padding(8.dp)) {
        Switch(
            checked = checked,
            onCheckedChange = { checked = it }
        )
        Text("Switch", modifier = Modifier.padding(start = 8.dp))
    }
}
//TopAppBar
@Composable
fun TopAppBarExample() {
    Scaffold(
        topBar = {
            TopAppBar(
                title = { Text("TopAppBar") },
                backgroundColor = MaterialTheme.colors.primary
            )
        }
    ) {
        Text("Content goes here", Modifier.padding(16.dp))
    }
}
