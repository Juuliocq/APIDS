import { Seller } from "./sellers"

export type SaleSum = {
    sellerName: string,
    sum: number
}

export type SaleSuccess = {
    sellerName: string,
    visited: number,
    deals: number
}

export type Sale = {
    id: number,
    visited: number,
    deals: number,
    amount: number,
    date: string,
    seller: Seller
}

export type SalePage = {
    content?: Sale[],
    totalElements: number,
    totalPages: number,
    last: boolean,
    first: boolean,
    number: number,
    size?: number,
    numberOfElements?: number,
    empty?: boolean
}