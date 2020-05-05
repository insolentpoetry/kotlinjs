@file:JsModule("apollo-server")
@file:JsNonModule

package com.insolentpoetry

import kotlin.js.Promise

external fun gql(template: String)

external interface ServerInfo {
    var address: String
    var family: String
    var url: String
    var subscriptionsUrl: String
    var port: dynamic /* Number | String */
        get() = definedExternally
        set(value) = definedExternally
    var subscriptionsPath: String
    var server: Any
}

external open class ApolloServer(config: Any) : Any {
    open var httpServer: Any
    open var cors: Any
    open var onHealthCheck: Any
    open var createServerInfo: Any
    open fun applyMiddleware()
    open fun listen(vararg opts: Any): Promise<ServerInfo>
    open fun stop(): Promise<Unit>
}
