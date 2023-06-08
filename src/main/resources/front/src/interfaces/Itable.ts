export interface ItopCustomers extends Object {
  username: string;
  order: number;
  price: string;
}

export type TlatestTransactions = {
  orderId: string;
  customer: string;
  totalPrice: string;
  date: string;
  status: string;
};

export interface IcustomersTable {
  firstName: string;
  lastName: string;
  email: string;
  password: string;
  created_at: string;
  active: boolean;
  

}

export interface IProductsTable {
  name: string;
  code: string;
}

export type complex =
  | ItopCustomers
  | TlatestTransactions
  | IcustomersTable
  | IProductsTable;

export interface Itable {
  limit?: number;
  selectedCategory?: string;
  headData: string[];
  bodyData: (
    | ItopCustomers
    | TlatestTransactions
    | IcustomersTable
    | IProductsTable
  )[];
}
