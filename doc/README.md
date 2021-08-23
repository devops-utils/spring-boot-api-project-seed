http://localhost:8080/

curl -XPOST 'http://localhost:8080/test/list'

```json
{
  "code": 200,
  "data": {
    "endRow": 0,
    "firstPage": 0,
    "hasNextPage": false,
    "hasPreviousPage": false,
    "isFirstPage": false,
    "isLastPage": true,
    "lastPage": 0,
    "list": [],
    "navigateFirstPage": 0,
    "navigateLastPage": 0,
    "navigatePages": 8,
    "navigatepageNums": [],
    "nextPage": 0,
    "orderBy": null,
    "pageNum": 0,
    "pageSize": 0,
    "pages": 0,
    "prePage": 0,
    "size": 0,
    "startRow": 0,
    "total": 0
  },
  "message": "SUCCESS"
}
```