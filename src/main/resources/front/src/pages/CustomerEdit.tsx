import React from "react";
import { useTranslation } from "react-i18next";
import useFetch from "../hook/useFetch";
import { useParams } from "react-router-dom";
import EditCustomer from "../components/edit/editCustomer/EditCustomer";
import { IcustomersTable } from "../interfaces/Itable";
import { customers } from "../constants/tables";
import LoadingSpinner from "../components/UI/loadingSpinner/LoadingSpinner";
const url =
  "http://localhost:8080/";
function CustomerEdit() {
  const { t } = useTranslation();

  let customerEdit;

  const { data, status } = useFetch<IcustomersTable>(
    `${url}/users/`
  );

  if (status === "loading") {
    customerEdit = <LoadingSpinner />;
  }


  if (status === "fetched" && data) {
    customerEdit = <EditCustomer customer={data} />;
  }

  return (
    <section>
      <h2 className="title">{t("editCustomer")}</h2>
      {customerEdit}
    </section>
  );
}

export default CustomerEdit;
