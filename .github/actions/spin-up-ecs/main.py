import os

import boto3


def run():
    # bucket = os.environ['INPUT_BUCKET']
    # bucket_region = os.environ['INPUT_BUCKET-REGION']
    app_clusters = os.environ['INPUT_APP-CLUSTERS']
    service_name = os.environ['INPUT_APP-NAME']

    ecs_client = boto3.client('ecs')
    ecs_client.update_service(
        cluster=app_clusters,
        service=service_name,
        taskDefinition='app_demo_task_definition:2',
        forceNewDeployment=True
    )


if __name__ == '__main__':
    run()
