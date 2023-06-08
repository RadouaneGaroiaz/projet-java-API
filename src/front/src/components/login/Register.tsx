import React, { useContext, useRef } from "react";

import LoginContext from "../../store/loginContext";
import langContextObj from "../../store/langContext";
import { images } from "../../constants";
import Input from "../UI/input/Input";
import Button from "../UI/button/Button";
import { useTranslation } from "react-i18next";
import classes from "./Login.module.scss";
import { Link, useNavigate } from "react-router-dom";

function RegisterBox() {
  const loginCtx = useContext(LoginContext);
  const langCtx = useContext(langContextObj);
  const userNameRef = useRef<HTMLInputElement>(null);
  const firstNameRef = useRef<HTMLInputElement>(null);
  const lastNameRef = useRef<HTMLInputElement>(null);
  const emailRef = useRef<HTMLInputElement>(null);
  const passwordRef = useRef<HTMLInputElement>(null);

  const errorMessageRef = useRef<HTMLSpanElement>(null);
  const navigate = useNavigate();
  const { t } = useTranslation();

  let isValid = true;
  function loginHandler(e: React.FormEvent) {
    e.preventDefault();
    isValid = firstNameRef.current?.value !== "" && lastNameRef.current?.value !== "" && emailRef.current?.value !== "" && passwordRef.current?.value !== "";
    if (firstNameRef.current && lastNameRef.current && emailRef.current && passwordRef.current) {
      if (isValid) {
        loginCtx.toggleLogin();
        navigate("/");
      } else {
        firstNameRef.current.focus();
        lastNameRef.current.focus();
        emailRef.current.focus();
        passwordRef.current.focus();
        errorMessageRef.current?.setAttribute(
          "style",
          "display: inline-block;opacity: 1"
        );
      }
    }
  }

  return (
    <div
      className={`${classes.container} ${
        langCtx.lang === "fa" ? classes.rtl : ""
      }`}
    >
      <div className={classes.loginBox}>
      
        <h2 className={classes.title}>Register your account</h2>
        <form onSubmit={loginHandler}>
          <Input
            ref={firstNameRef}
            type={"text"}
            id={"firstName"}
            placeholder={"firstName"}
          />
          <span ref={errorMessageRef} className={classes.errorMessage}>
            please enter your firstName
          </span>
       
          <Input
            ref={lastNameRef}
            type={"text"}
            id={"lastName"}
            placeholder={"lastName"}
          />
          <span ref={errorMessageRef} className={classes.errorMessage}>
            please enter your lastName
          </span>
          <Input
            ref={emailRef}
            type={"text"}
            id={"email"}
            placeholder={"email"}
          />
          <span ref={errorMessageRef} className={classes.errorMessage}>
            please enter your email
          </span>
          <Input
            type={"file"}
            id={"photo"}
          />
          <span ref={errorMessageRef} className={classes.errorMessage}>
            please enter your photo
          </span>
          <Input
            ref={passwordRef}
            type={"password"}
            id={"pass"}
            
            readonly={true}
          />
          <span ref={errorMessageRef} className={classes.errorMessage}>
            please enter your password
          </span>
          <Button type="submit">Register</Button>
          <div className={classes.checkbox}>
            <input type="checkbox" id="rememberMe" />
            <label htmlFor="rememberMe">{t("rememberMe")}</label>           
          </div>
         
        </form>
      </div>

      <div className={classes.keyPic}>
        <img
          src={require("../../assets/images/Revenue-cuate.svg").default}
          alt="illustrator key"
        />
      </div>
    </div>
  );
}

export default RegisterBox;






