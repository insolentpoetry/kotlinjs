package com.insolentpoetry

//external fun require(module: String): dynamic

data class Book(val author: String, val title: String)

val Query = object {
    fun books(vararg argvs: Any): Book {
        console.log(argvs)
        return Book("Pippo", "Return of Scorecca")
    }
}

fun main() {

    val config = object {
        val resolvers = Query
        val typeDefs = gql("""
# Comments in GraphQL strings (such as this one) start with the hash (#) symbol.
# This "Book" type defines the queryable fields for every book in our data source.
type Book {
  title: String
  author: String
}

# The "Query" type is special: it lists all of the available queries that
# clients can execute, along with the return type for each. In this
# case, the "books" query returns an array of zero or more Books (defined above).
type Query {
  books: [Book]
}
""".trimIndent())
    }

    ApolloServer(config).listen().then {
        console.log(it)
    }

    val ciccio = ApolloServer()

    ciccio.toString()

    console.log(server)
    val a = 10
    print(a)
}
