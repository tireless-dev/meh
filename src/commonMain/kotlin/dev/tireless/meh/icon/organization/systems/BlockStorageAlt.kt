package dev.tireless.meh.icon.organization.systems

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val BlockStorageAlt: ImageVector
    get() {
        val current = _blockStorageAlt
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.BlockStorageAlt",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 20 h-2 v2 h2 v6 H4 v-6 h2 v-2 H4 a2 2 0 0 0 -2 2 v6 a2 2 0 0 0 2 2 h24 a2 2 0 0 0 2 -2 v-6 a2 2 0 0 0 -2 -2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 20
                moveTo(x = 28.0f, y = 20.0f)
                // h -2
                horizontalLineToRelative(dx = -2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
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
                // v 6
                verticalLineToRelative(dy = 6.0f)
                // a 2 2 0 0 0 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // h 24
                horizontalLineToRelative(dx = 24.0f)
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
                // v -6
                verticalLineToRelative(dy = -6.0f)
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
            }
            // <circle cx="7.0" cy="25.0" radius="1.0" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 7 25
                moveTo(x = 7.0f, y = 25.0f)
                // m -1 0
                moveToRelative(dx = -1.0f, dy = 0.0f)
                // a 1 1 0 1 1 2 0
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 0.0f,
                )
                // a 1 1 0 1 1 -2 0z
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M15 20 H8 v-7 h7Z m-5 -2 h3 v-3 h-3Z m14 2 h-7 v-7 h7Z m-5 -2 h3 v-3 h-3Z m-4 -7 H8 V4 h7Z m-5 -2 h3 V6 h-3Z m14 2 h-7 V4 h7Z m-5 -2 h3 V6 h-3Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 15 20
                moveTo(x = 15.0f, y = 20.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // m -5 -2
                moveToRelative(dx = -5.0f, dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // m 14 2
                moveToRelative(dx = 14.0f, dy = 2.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // v -7
                verticalLineToRelative(dy = -7.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // m -5 -2
                moveToRelative(dx = -5.0f, dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v -3
                verticalLineToRelative(dy = -3.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // m -4 -7
                moveToRelative(dx = -4.0f, dy = -7.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // m -5 -2
                moveToRelative(dx = -5.0f, dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
                close()
                // m 14 2
                moveToRelative(dx = 14.0f, dy = 2.0f)
                // h -7
                horizontalLineToRelative(dx = -7.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 7z
                horizontalLineToRelative(dx = 7.0f)
                close()
                // m -5 -2
                moveToRelative(dx = -5.0f, dy = -2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // V 6
                verticalLineTo(y = 6.0f)
                // h -3z
                horizontalLineToRelative(dx = -3.0f)
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
        }.build().also { _blockStorageAlt = it }
    }

@Suppress("ObjectPropertyName")
private var _blockStorageAlt: ImageVector? = null
