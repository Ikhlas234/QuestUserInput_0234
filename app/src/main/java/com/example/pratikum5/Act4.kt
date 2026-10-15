
OutlinedTextField(
value = textNama,
singleLine = true,
shape = MaterialTheme.shapes.large,
modifier = Modifier.width(250.dp),
label = { Text(text = "Nama Lengkap") },
onValueChange = {
    textNama = it
}
)


