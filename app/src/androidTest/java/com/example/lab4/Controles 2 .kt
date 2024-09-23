package com.example.lab4

//BottomNavigation
@Composable
fun BottomNavigationExample() {
    var selectedItem by remember { mutableStateOf(0) }

    Scaffold(
        bottomBar = {
            BottomNavigation {
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Home, contentDescription = null) },
                    label = { Text("Home") },
                    selected = selectedItem == 0,
                    onClick = { selectedItem = 0 }
                )
                BottomNavigationItem(
                    icon = { Icon(Icons.Default.Favorite, contentDescription = null) },
                    label = { Text("Favorites") },
                    selected = selectedItem == 1,
                    onClick = { selectedItem = 1 }
                )
            }
        }
    ) {
        Text("Bottom Navigation Example", Modifier.padding(16.dp))
    }
}
//Dialog
@Composable
fun DialogExample() {
    var showDialog by remember { mutableStateOf(true) }

    if (showDialog) {
        Dialog(onDismissRequest = { showDialog = false }) {
            Surface(
                modifier = Modifier
                    .padding(16.dp)
                    .fillMaxWidth(),
                shape = RoundedCornerShape(8.dp),
                color = MaterialTheme.colors.background
            ) {
                Text("This is a dialog", Modifier.padding(16.dp))
            }
        }
    }
}
//Divider
@Composable
fun DividerExample() {
    Column {
        Text("Above the Divider")
        Divider(modifier = Modifier.padding(vertical = 8.dp))
        Text("Below the Divider")
    }
}
//DropDownMenu
@Composable
fun DropDownMenuExample() {
    var expanded by remember { mutableStateOf(false) }
    var selectedOption by remember { mutableStateOf("Select an option") }

    Box(modifier = Modifier.padding(16.dp)) {
        Text(text = selectedOption, modifier = Modifier.clickable { expanded = true })

        DropdownMenu(
            expanded = expanded,
            onDismissRequest = { expanded = false }
        ) {
            DropdownMenuItem(onClick = {
                selectedOption = "Option 1"
                expanded = false
            }) {
                Text("Option 1")
            }
            DropdownMenuItem(onClick = {
                selectedOption = "Option 2"
                expanded = false
            }) {
                Text("Option 2")
            }
        }
    }
}
//NavigationRail
@Composable
fun NavigationRailExample() {
    var selectedItem by remember { mutableStateOf(0) }

    NavigationRail {
        NavigationRailItem(
            icon = { Icon(Icons.Default.Home, contentDescription = null) },
            label = { Text("Home") },
            selected = selectedItem == 0,
            onClick = { selectedItem = 0 }
        )
        NavigationRailItem(
            icon = { Icon(Icons.Default.Favorite, contentDescription = null) },
            label = { Text("Favorites") },
            selected = selectedItem == 1,
            onClick = { selectedItem = 1 }
        )
    }
}
//OutlinedTextFiled

@Composable
fun OutlinedTextFieldExample() {
    var text by remember { mutableStateOf("") }

    OutlinedTextField(
        value = text,
        onValueChange = { text = it },
        label = { Text("Enter text") },
        modifier = Modifier.padding(16.dp)
    )
}
//Pager
// Necesitas añadir la dependencia de "accompanist-pager" para usar Pager

@OptIn(ExperimentalPagerApi::class)
@Composable
fun PagerExample() {
    val pagerState = rememberPagerState()

    HorizontalPager(
        count = 3,
        state = pagerState,
        modifier = Modifier.fillMaxSize()
    ) { page ->
        Text("Page: $page", modifier = Modifier.fillMaxSize().padding(16.dp))
    }
}
//Snackbar
@Composable
fun SnackbarExample() {
    val scaffoldState = rememberScaffoldState()

    Scaffold(
        scaffoldState = scaffoldState,
        modifier = Modifier.padding(16.dp)
    ) {
        Button(onClick = {
            coroutineScope.launch {
                scaffoldState.snackbarHostState.showSnackbar("This is a Snackbar")
            }
        }) {
            Text("Show Snackbar")
        }
    }
}
//TabRow
@Composable
fun TabRowExample() {
    var selectedTabIndex by remember { mutableStateOf(0) }

    val tabs = listOf("Tab 1", "Tab 2", "Tab 3")

    Column {
        TabRow(selectedTabIndex = selectedTabIndex) {
            tabs.forEachIndexed { index, title ->
                Tab(
                    selected = selectedTabIndex == index,
                    onClick = { selectedTabIndex = index },
                    text = { Text(title) }
                )
            }
        }
        Text("Selected tab: ${tabs[selectedTabIndex]}", Modifier.padding(16.dp))
    }
}
