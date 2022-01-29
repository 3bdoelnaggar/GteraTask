package com.gtera.gteratask.domain.repository

import com.gtera.gteratask.Result
import com.gtera.gteratask.domain.model.Product

interface ProductSource {
   suspend fun fetchProducts(query:String?):Result<List<Product>>
}