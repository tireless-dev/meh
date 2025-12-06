package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val DocumentUnknown: ImageVector
    get() {
        val current = _documentUnknown
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.DocumentUnknown",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // <circle cx="9.0" cy="28.5" radius="1.5" fill="#000" />
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 9 28.5
                moveTo(x = 9.0f, y = 28.5f)
                // m -1.5 0
                moveToRelative(dx = -1.5f, dy = 0.0f)
                // a 1.5 1.5 0 1 1 3 0
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = 3.0f,
                    dy1 = 0.0f,
                )
                // a 1.5 1.5 0 1 1 -3 0z
                arcToRelative(
                    a = 1.5f,
                    b = 1.5f,
                    theta = 0.0f,
                    isMoreThanHalf = true,
                    isPositiveArc = true,
                    dx1 = -3.0f,
                    dy1 = 0.0f,
                )
                close()
            }
            // M10 25 H8 v-4 h2 a2 2 0 0 0 0 -4 H8 a2 2 0 0 0 -2 2 v.5 H4 V19 a4 4 0 0 1 4 -4 h2 a4 4 0 0 1 0 8Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 10 25
                moveTo(x = 10.0f, y = 25.0f)
                // H 8
                horizontalLineTo(x = 8.0f)
                // v -4
                verticalLineToRelative(dy = -4.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 2 2 0 0 0 0 -4
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.0f,
                )
                // H 8
                horizontalLineTo(x = 8.0f)
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
                // v 0.5
                verticalLineToRelative(dy = 0.5f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // V 19
                verticalLineTo(y = 19.0f)
                // a 4 4 0 0 1 4 -4
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 4.0f,
                    dy1 = -4.0f,
                )
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // a 4 4 0 0 1 0 8z
                arcToRelative(
                    a = 4.0f,
                    b = 4.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 0.0f,
                    dy1 = 8.0f,
                )
                close()
            }
            // m27.7 9.3 -7 -7 A1 1 0 0 0 20 2 H10 a2 2 0 0 0 -2 2 v8 h2 V4 h8 v6 a2 2 0 0 0 2 2 h6 v16 H14 v2 h12 a2 2 0 0 0 2 -2 V10 a1 1 0 0 0 -.3 -.7 M20 10 V4.4 l5.6 5.6Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 27.7 9.3
                moveTo(x = 27.7f, y = 9.3f)
                // l -7 -7
                lineToRelative(dx = -7.0f, dy = -7.0f)
                // A 1 1 0 0 0 20 2
                arcTo(
                    horizontalEllipseRadius = 1.0f,
                    verticalEllipseRadius = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 20.0f,
                    y1 = 2.0f,
                )
                // H 10
                horizontalLineTo(x = 10.0f)
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
                // v 8
                verticalLineToRelative(dy = 8.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // V 4
                verticalLineTo(y = 4.0f)
                // h 8
                horizontalLineToRelative(dx = 8.0f)
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
                // h 6
                horizontalLineToRelative(dx = 6.0f)
                // v 16
                verticalLineToRelative(dy = 16.0f)
                // H 14
                horizontalLineTo(x = 14.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 12
                horizontalLineToRelative(dx = 12.0f)
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
                // V 10
                verticalLineTo(y = 10.0f)
                // a 1 1 0 0 0 -0.3 -0.7
                arcToRelative(
                    a = 1.0f,
                    b = 1.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -0.3f,
                    dy1 = -0.7f,
                )
                // M 20 10
                moveTo(x = 20.0f, y = 10.0f)
                // V 4.4
                verticalLineTo(y = 4.4f)
                // l 5.6 5.6z
                lineToRelative(dx = 5.6f, dy = 5.6f)
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
        }.build().also { _documentUnknown = it }
    }

@Suppress("ObjectPropertyName")
private var _documentUnknown: ImageVector? = null
