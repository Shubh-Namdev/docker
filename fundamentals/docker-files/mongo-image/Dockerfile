
# base image
FROM alpine

# install the software
RUN echo 'http://dl-cdn.alpinelinux.org/alpine/v3.6/main' >> /etc/apk/repositories
RUN echo 'http://dl-cdn.alpinelinux.org/alpine/v3.6/community' >> /etc/apk/repositories

RUN apk update
RUN apk add mongodb=3.4.4-r0


# configure the software
VOLUME [ "/data/db" ]
WORKDIR /data
EXPOSE 27017


# RUN
CMD [ "mongod" ]



# Note -
    # 1. When we rebuild the image without any changes, it builds faster due to cache concept
    # 2. When we are doing any change then after that line everything starts again, it doesn't fetch from cache
    # 3. docker run -t "image name" path : it should follow the name convention
