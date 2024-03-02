import {Navigate, Route, Routes} from 'react-router-dom'
import SignUp from "./SignUp";
import Login from "./Login";
import React from "react";
import {AuthLayout} from "../../../modules/auth/AuthLayout";

const AuthPage = () => (
    <Routes>
        <Route element={<AuthLayout />}>
            <Route path='*' element={<Navigate to='login' />} />
            <Route path='login' element={<Login />} />
            <Route path='signup' element={<SignUp />} />
            <Route index element={<Login />} />
        </Route>
    </Routes>
)

export {AuthPage}
