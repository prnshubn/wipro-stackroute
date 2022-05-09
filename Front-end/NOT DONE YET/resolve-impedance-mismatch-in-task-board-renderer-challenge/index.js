var transform= require("./scripts/transformer");

const input = {
    "boards": [{
        "boardId": 11,
        "boardTitle": "Product Rating Analysis"
    }],
    "lists": [{
        "listId": 9,
        "listTitle": "Product 1",
        "boardId": 11
    },
    {
        "listId": 99,
        "listTitle": "Product 2",
        "boardId": 11
    },
    {
        "listId": 8,
        "listTitle": "Product 3",
        "boardId": 10
    }
    ],
    "cards": [
        {
            "cardId": 12,
            "cardTitle": "Rating in Q1",
            "listId": 99
        },
        {
            "cardId": 14,
            "cardTitle": "Rating in Q2",
            "listId": 9
        },
        {
            "cardId": 16,
            "cardTitle": "Rating in Q3",
            "listId": 8
        }
    ],
    "comments": [
        {
            "commentId": 1001,
            "commentText": "Met the budget",
            "cardId": 12
        },
        {
            "commentId": 1002,
            "commentText": "Failed to meet the expectation.",
            "cardId": 14
        },
        {
            "commentId": 1003,
            "commentText": "Always in Demand",
            "cardId": 16
        },
    ]
}

const _transform = transform(input);
console.log(_transform[0].boardId);