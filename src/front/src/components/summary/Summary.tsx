import React from "react";

import SummaryBox from "./SummaryBox";
import { useTranslation } from "react-i18next";
import classes from "./Summary.module.scss";
import { IsummData } from "../../interfaces/IsummData";

const summaryData: IsummData[] = [
  {
    photo: "akar-icons:shopping-bag",
    desc: "thisMonthSales",
    price: 9,
    category: "currency",
    code : "code",
    name : "name",
  },
  {
    photo: "icon-park-outline:transaction-order",
    desc: "thisMonthOrders",
    price: 10,
    category: "currency",
    code : "",
    name : "",
  },
  {
    photo: "jam:coin",
    desc: "thisMonthRevenue",
    price: 20,
    category: "currency",
    code : "code",
    name : "name",
  },
];

function Summary() {
  const { t } = useTranslation();
  return (
    <section className={classes.summary}>
      <p className="subTitle">{t("Available products")}</p>
      <div className={classes.summary__box}>
        {summaryData.map((item) => (
          <SummaryBox key={item.desc} item={item} />
        ))}
      </div>
    </section>
  );
}

export default Summary;
