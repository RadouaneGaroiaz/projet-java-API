



export interface IcustomersTable {
  firstName: string;
  lastName: string;
  email: string;
  password: string;
  created_at: string;
  active: boolean;
  photo: string;

}

export interface IProductsTable {
  name: string;
  code: string;
  category: string;
  price: string;
  photo: string;
  description: string;
  
  
}

export type complex =
  
   IcustomersTable
  | IProductsTable;

export interface Itable {
  limit?: number;
  selectedCategory?: string;
  headData: string[];
  bodyData: (

    IcustomersTable
    | IProductsTable
  )[];
}
