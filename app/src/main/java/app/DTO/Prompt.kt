package app.DTO

data class Prompt(
    var PromptText: String,
    var Energy: Int,
    var Money: Int,
    var Status: Int,
    var Left: Int,
    var Right: Int
)