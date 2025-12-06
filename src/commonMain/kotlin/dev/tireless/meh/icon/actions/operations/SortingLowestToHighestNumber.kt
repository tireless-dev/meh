package dev.tireless.meh.icon.actions.operations

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val SortingLowestToHighestNumber: ImageVector
    get() {
        val current = _sortingLowestToHighestNumber
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.SortingLowestToHighestNumber",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m15.98 2 -5 6 h10z m0 28 5 -6 h-10z m-5 -11 h-2 v-8 h-2 v1 h-2 v2 h2 v5 h-2 v2 h6z m14 -2 a2 2 0 0 0 2 -2 v-2 a2 2 0 0 0 -2 -2 h-4 v2 h4 v2 h-2 a2 2 0 0 0 -2 2 v4 h6 v-2 h-4 v-2z m-6 0 v-2 h-6 v2z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15.98 2
                moveTo(x = 15.98f, y = 2.0f)
                // l -5 6
                lineToRelative(dx = -5.0f, dy = 6.0f)
                // h 10z
                horizontalLineToRelative(dx = 10.0f)
                close()
                // m 0 28
                moveToRelative(dx = 0.0f, dy = 28.0f)
                // l 5 -6
                lineToRelative(dx = 5.0f, dy = -6.0f)
                // h -10z
                horizontalLineToRelative(dx = -10.0f)
                close()
                // m -5 -11
                moveToRelative(dx = -5.0f, dy = -11.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v -8
                verticalLineToRelative(dy = -8.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 1
                verticalLineToRelative(dy = 1.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 5
                verticalLineToRelative(dy = 5.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
                // m 14 -2
                moveToRelative(dx = 14.0f, dy = -2.0f)
                // a 2 2 0 0 0 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // a 2 2 0 0 0 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // a 2 2 0 0 0 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v -2z
                verticalLineToRelative(dy = -2.0f)
                close()
                // m -6 0
                moveToRelative(dx = -6.0f, dy = 0.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 2z
                verticalLineToRelative(dy = 2.0f)
                close()
            }
            // <rect width="32" height="32" fill="#000" style="fill:none" />
            path(
                fill = SolidColor(Color.Transparent),
            ) {
                // M 0 0
                moveTo(x = 0.0f, y = 0.0f)
                // h 32
                horizontalLineToRelative(dx = 32.0f)
                // v 32
                verticalLineToRelative(dy = 32.0f)
                // h -32z
                horizontalLineToRelative(dx = -32.0f)
                close()
            }
        }.build().also { _sortingLowestToHighestNumber = it }
    }

@Suppress("ObjectPropertyName")
private var _sortingLowestToHighestNumber: ImageVector? = null
