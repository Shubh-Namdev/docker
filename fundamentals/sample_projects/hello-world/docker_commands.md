Docker commands

# Build an image
  * docker build -t 'tag-name' 'path where your docker file exist'

# Run a container
  * docker run 'image-id'

# List images
  * docker image ls

# List containers
  * docker ps (running containers)
  * docker ps -a (stopped containers)

# Delete container and image
Note : image can't be deleted before deleting a container
  * docker rm 'container-id'
  * docker image rm 'image-id'

# pull image and run from docker hub
  * docker pull 'image-name'
  * docker run 'image-id/image-name'
  