
OutlinedTextField(
value = textAlamat,
singleLine = true,
modifier = Modifier.width(250.dp),
label = { Text("Alamat") },
onValueChange = {
    textAlamat = it
}
)
