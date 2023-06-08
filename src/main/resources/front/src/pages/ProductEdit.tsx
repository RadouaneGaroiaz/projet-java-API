import React from "react";
import { useTranslation } from "react-i18next";
import useFetch from "../hook/useFetch";
import { useParams } from "react-router-dom";
import EditProduct from "../components/edit/editProduct/EditProduct";
import { IProductsTable } from "../interfaces/Itable";
import { products } from "../constants/tables";
import LoadingSpinner from "../components/UI/loadingSpinner/LoadingSpinner";

const url =
  "http://localhost:8080/";
function ProductEdit() {
  const { t } = useTranslation();


console.log(products);



  let productEdit;

  const { data, status } = useFetch<IProductsTable>(
    `${url}/products/`
  );

  if (status === "loading") {
    productEdit = <LoadingSpinner />;
  }


  if (status === "fetched" && data) {
    productEdit = <EditProduct product={data} />;
  }

  return (
    <section>
      <h2 className="title">{t("editProduct")}</h2>
      {productEdit}
    </section>
  );
}

export default ProductEdit;
