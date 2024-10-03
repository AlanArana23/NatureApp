package com.example.natureapp.ui.theme.models

data class NaturalPlace(
    val image: String,
    val title : String,
    val description: String
)

val naturalPlaces = listOf(
    NaturalPlace(
        image = "https://www.edreams.es/blog/wp-content/uploads/sites/5/2014/10/parque-banff-canada.jpg.webp",
        title = "Parque Banff",
        description = "El Parque Nacional Banff, en Canadá, es famoso por sus montañas, lagos cristalinos y vida silvestre impresionante."
    ),
    NaturalPlace(
        image = "https://www.edreams.es/blog/wp-content/uploads/sites/5/2014/10/yosemite-park.jpg.webp",
        title = "Parque Yosemite",
        description = "El Parque Yosemite, en California, destaca por sus imponentes acantilados, cascadas, secuoyas gigantes y biodiversidad única."
    ),
    NaturalPlace(
        image = "https://www.edreams.es/blog/wp-content/uploads/sites/5/2014/10/jasper-park.jpg.webp",
        title = "Parque Jasper",
        description = "El Parque Nacional Jasper, en Canadá, es conocido por sus montañas escarpadas, glaciares, lagos y abundante vida salvaje."
    ),
    NaturalPlace(
        image = "https://cloudfront-eu-central-1.images.arcpublishing.com/prisa/PKWBOQRTMRIQ5F6JQ3UDDLAZXY.jpg",
        title = "Parque Yellostone",
        description = "El Parque Yellowstone, en EE. UU., es famoso por sus géiseres, aguas termales, cañones y diversidad de vida silvestre."
    ),
    NaturalPlace(
        image = "https://www.gob.mx/cms/uploads/image/file/647477/malinche-3.jpg",
        title = "Parque Nacional LA MALINCHE",
        description = "El Parque Nacional La Malinche, en México, es conocido por su volcán, paisajes boscosos y rutas de senderismo."
    )
)
