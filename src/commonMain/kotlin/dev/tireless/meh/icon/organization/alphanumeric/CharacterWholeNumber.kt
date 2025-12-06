package dev.tireless.meh.icon.organization.alphanumeric

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CharacterWholeNumber: ImageVector
    get() {
        val current = _characterWholeNumber
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CharacterWholeNumber",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M28 9 h-6 v2 h6 v4 h-4 v2 h4 v4 h-6 v2 h6 a2 2 0 0 0 2 -2 V11 a2 2 0 0 0 -2 -2 m-8 14 h-8 v-6 a2 2 0 0 1 2 -2 h4 v-4 h-6 V9 h6 a2 2 0 0 1 2 2 v4 a2 2 0 0 1 -2 2 h-4 v4 h6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 28 9
                moveTo(x = 28.0f, y = 9.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
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
                // V 11
                verticalLineTo(y = 11.0f)
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
                // m -8 14
                moveToRelative(dx = -8.0f, dy = 14.0f)
                // h -8
                horizontalLineToRelative(dx = -8.0f)
                // v -6
                verticalLineToRelative(dy = -6.0f)
                // a 2 2 0 0 1 2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = -2.0f,
                )
                // h 4
                horizontalLineToRelative(dx = 4.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h -6
                horizontalLineToRelative(dx = -6.0f)
                // V 9
                verticalLineTo(y = 9.0f)
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // a 2 2 0 0 1 2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 2.0f,
                    dy1 = 2.0f,
                )
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // a 2 2 0 0 1 -2 2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = 2.0f,
                )
                // h -4
                horizontalLineToRelative(dx = -4.0f)
                // v 4
                verticalLineToRelative(dy = 4.0f)
                // h 6z
                horizontalLineToRelative(dx = 6.0f)
                close()
            }
            // <polygon points="2.5 22.5 2.5 21.5 5.5 21.5 5.5 10.5 2.5 10.5 2.5 9.5 6.5 9.5 6.5 21.5 9.5 21.5 9.5 22.5 2.5 22.5" fill="#000" style="fill:#fff" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 2.5 22.5
                moveTo(x = 2.5f, y = 22.5f)
                // L 2.5 21.5
                lineTo(x = 2.5f, y = 21.5f)
                // L 5.5 21.5
                lineTo(x = 5.5f, y = 21.5f)
                // L 5.5 10.5
                lineTo(x = 5.5f, y = 10.5f)
                // L 2.5 10.5
                lineTo(x = 2.5f, y = 10.5f)
                // L 2.5 9.5
                lineTo(x = 2.5f, y = 9.5f)
                // L 6.5 9.5
                lineTo(x = 6.5f, y = 9.5f)
                // L 6.5 21.5
                lineTo(x = 6.5f, y = 21.5f)
                // L 9.5 21.5
                lineTo(x = 9.5f, y = 21.5f)
                // L 9.5 22.5
                lineTo(x = 9.5f, y = 22.5f)
                // L 2.5 22.5z
                lineTo(x = 2.5f, y = 22.5f)
                close()
            }
            // M6 10 v12z m1 -1 H2 v2 h3 v10 H2 v2 h8 v-2 H7z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 6 10
                moveTo(x = 6.0f, y = 10.0f)
                // v 12z
                verticalLineToRelative(dy = 12.0f)
                close()
                // m 1 -1
                moveToRelative(dx = 1.0f, dy = -1.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 3
                horizontalLineToRelative(dx = 3.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
                // H 2
                horizontalLineTo(x = 2.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // H 7z
                horizontalLineTo(x = 7.0f)
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
        }.build().also { _characterWholeNumber = it }
    }

@Suppress("ObjectPropertyName")
private var _characterWholeNumber: ImageVector? = null
