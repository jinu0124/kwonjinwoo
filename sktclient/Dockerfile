FROM node:lts-alpine as build-stage
WORKDIR /app
COPY package.json package-lock.json /app/
RUN yarn install

COPY . /app
RUN yarn run build

# production stage
FROM nginx:stable-alpine as production-stage
COPY  ./.nginx/default.conf /etc/nginx/conf.d/default.conf

COPY --from=build-stage /app/dist /usr/share/nginx/html
# EXPOSE 8000
CMD ["nginx", "-g", "daemon off;"]
