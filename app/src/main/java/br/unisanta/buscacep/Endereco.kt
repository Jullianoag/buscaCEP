package br.unisanta.buscacep

data class Endereco(
    val cep:String?,
    val logradouro:String?,
    val bairro:String?,
    val localidade:String?,
    val uf:String?,
    val erro:Boolean?
)
