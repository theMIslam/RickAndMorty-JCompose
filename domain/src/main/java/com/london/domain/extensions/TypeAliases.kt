package com.london.domain.extensions

import kotlinx.coroutines.flow.Flow

internal typealias RemoteWrapper<T> = Flow<Either<NetworkError, T>>