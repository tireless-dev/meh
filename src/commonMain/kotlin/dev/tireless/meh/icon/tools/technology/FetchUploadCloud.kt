package dev.tireless.meh.icon.tools.technology

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val FetchUploadCloud: ImageVector
    get() {
        val current = _fetchUploadCloud
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.FetchUploadCloud",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // m16 13 -5 5 1.41 1.41 L15 16.83 V28 H6 v2 h9 a2 2 0 0 0 2 -2 V16.83 l2.59 2.58 L21 18Z
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 16 13
                moveTo(x = 16.0f, y = 13.0f)
                // l -5 5
                lineToRelative(dx = -5.0f, dy = 5.0f)
                // l 1.41 1.41
                lineToRelative(dx = 1.41f, dy = 1.41f)
                // L 15 16.83
                lineTo(x = 15.0f, y = 16.83f)
                // V 28
                verticalLineTo(y = 28.0f)
                // H 6
                horizontalLineTo(x = 6.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // h 9
                horizontalLineToRelative(dx = 9.0f)
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
                // V 16.83
                verticalLineTo(y = 16.83f)
                // l 2.59 2.58
                lineToRelative(dx = 2.59f, dy = 2.58f)
                // L 21 18z
                lineTo(x = 21.0f, y = 18.0f)
                close()
            }
            // M23.5 22 H23 v-2 h.5 a4.5 4.5 0 0 0 .36 -8.98 l-.82 -.06 -.1 -.82 a7 7 0 0 0 -13.88 0 l-.1 .82 -.82 .06 A4.5 4.5 0 0 0 8.5 20 H9 v2 H8.5 A6.5 6.5 0 0 1 7.2 9.14 a9 9 0 0 1 17.6 0 A6.5 6.5 0 0 1 23.5 22
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 23.5 22
                moveTo(x = 23.5f, y = 22.0f)
                // H 23
                horizontalLineTo(x = 23.0f)
                // v -2
                verticalLineToRelative(dy = -2.0f)
                // h 0.5
                horizontalLineToRelative(dx = 0.5f)
                // a 4.5 4.5 0 0 0 0.36 -8.98
                arcToRelative(
                    a = 4.5f,
                    b = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.36f,
                    dy1 = -8.98f,
                )
                // l -0.82 -0.06
                lineToRelative(dx = -0.82f, dy = -0.06f)
                // l -0.1 -0.82
                lineToRelative(dx = -0.1f, dy = -0.82f)
                // a 7 7 0 0 0 -13.88 0
                arcToRelative(
                    a = 7.0f,
                    b = 7.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -13.88f,
                    dy1 = 0.0f,
                )
                // l -0.1 0.82
                lineToRelative(dx = -0.1f, dy = 0.82f)
                // l -0.82 0.06
                lineToRelative(dx = -0.82f, dy = 0.06f)
                // A 4.5 4.5 0 0 0 8.5 20
                arcTo(
                    horizontalEllipseRadius = 4.5f,
                    verticalEllipseRadius = 4.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    x1 = 8.5f,
                    y1 = 20.0f,
                )
                // H 9
                horizontalLineTo(x = 9.0f)
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 8.5
                horizontalLineTo(x = 8.5f)
                // A 6.5 6.5 0 0 1 7.2 9.14
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 7.2f,
                    y1 = 9.14f,
                )
                // a 9 9 0 0 1 17.6 0
                arcToRelative(
                    a = 9.0f,
                    b = 9.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 17.6f,
                    dy1 = 0.0f,
                )
                // A 6.5 6.5 0 0 1 23.5 22
                arcTo(
                    horizontalEllipseRadius = 6.5f,
                    verticalEllipseRadius = 6.5f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    x1 = 23.5f,
                    y1 = 22.0f,
                )
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
        }.build().also { _fetchUploadCloud = it }
    }

@Suppress("ObjectPropertyName")
private var _fetchUploadCloud: ImageVector? = null
