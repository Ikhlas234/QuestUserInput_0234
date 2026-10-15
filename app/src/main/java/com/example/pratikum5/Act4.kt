
Row {
    gender.forEach { item ->
        Row(
            modifier = Modifier.selectable(
                selected = textJK == item,
                onClick = { textJK = item }
            ),
            verticalAlignment = Alignment.CenterVertically
        ) {
            RadioButton(
                selected = textJK == item,
                onClick = {
                    textJK = item
                }
            )
            Text(item)
        }
    }
}




