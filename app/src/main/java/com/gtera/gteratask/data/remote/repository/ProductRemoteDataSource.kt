package com.gtera.gteratask.data.remote.repository

import com.gtera.gteratask.Result
import com.gtera.gteratask.domain.model.Product
import com.gtera.gteratask.domain.repository.ProductSource
import com.gtera.gteratask.safe

class ProductRemoteDataSource :ProductSource {
    override suspend fun fetchProducts(query: String?): Result<List<Product>> {
       return safe {
            listOf(Product(1L,"Mac"),Product(2L,"Pixel"))
        }
    }
}