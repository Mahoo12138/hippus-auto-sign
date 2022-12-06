import axios, { RawAxiosRequestHeaders } from "axios";

const httpService = axios.create({
  baseURL: "http://localhost:8080",
  withCredentials: true,
  timeout: 5000,
});
interface Headers extends RawAxiosRequestHeaders {
  token: string;
}

httpService.interceptors.request.use((config) => {
  if (config.headers) config.headers["token"] = "";
  return config;
});

httpService.interceptors.response.use((response) => {
  return response;
});

export default httpService;
