SELECT 
    i.ITEM_ID,
    i.ITEM_NAME,
    i.RARITY
FROM
    ITEM_INFO i
WHERE
    i.ITEM_ID IN (
        SELECT t.ITEM_ID
        FROM ITEM_TREE t
        WHERE t.PARENT_ITEM_ID IN (
            SELECT ii.ITEM_ID
            FROM ITEM_INFO ii
            WHERE ii.RARITY = 'RARE'
        )
    )
ORDER BY
    i.ITEM_ID DESC;