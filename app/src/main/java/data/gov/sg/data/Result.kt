package data.gov.sg.data

data class Result(
    val _links: Links,
    val fields: List<Field>,
    val records: List<Record>,
    val resource_id: String,
    val total: Int
)