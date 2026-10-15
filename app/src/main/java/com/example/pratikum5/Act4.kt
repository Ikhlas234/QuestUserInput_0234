Button(
modifier = Modifier.fillMaxWidth(1f),
// the button is enabled when the user makes a selection
enabled = textAlamat.isNotEmpty(),
onClick = {
    nama = textNama
    jenis = textJK
    alamat = textAlamat
}
) {
    Text(stringResource(id = R.string.Submit))
}
