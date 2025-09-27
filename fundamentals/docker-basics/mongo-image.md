
# How to work with a container 
  - container are secure
  - we don't get access to container unless we are not explictly doing so
  - container doen't interrupt each other

### Mongo image
  - `docker run mongo` : you won't get access to the container directly
  - `ctrl + c/d` to come out if terminal gets stucked
  - we are not able to perform any operation on this container
  - `docker ps -a`
  - `docker start {container_id}`
  - `docker exec -it {container_id} bash` : explicitly we are saying that we have to enter container 
                                            else it won't allow
  - now we have access to container mongo and we can play with it
  - `ctrl + d` to exit
  - `docker stop {container id}`
  - [docs](https://docs.docker.com/reference/cli/docker/container/exec/)
  - `docker run -it mongo bash` (not recommended)