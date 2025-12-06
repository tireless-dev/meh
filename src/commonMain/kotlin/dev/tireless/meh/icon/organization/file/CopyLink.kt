package dev.tireless.meh.icon.organization.file

import androidx.compose.ui.graphics.Color
import androidx.compose.ui.graphics.SolidColor
import androidx.compose.ui.graphics.vector.ImageVector
import androidx.compose.ui.graphics.vector.path
import androidx.compose.ui.unit.dp

val CopyLink: ImageVector
    get() {
        val current = _copyLink
        if (current != null) return current

        return ImageVector.Builder(
            name = "MehTheme.CopyLink",
            defaultWidth = 32.0.dp,
            defaultHeight = 32.0.dp,
            viewportWidth = 32.0f,
            viewportHeight = 32.0f,
        ).apply {
            // M11.95 19 a4.95 4.95 0 0 1 -3.5 -8.45 l5.1 -5.1 a4.95 4.95 0 0 1 7 7 L20 13 l-1.42 -1.41 .56 -.56 a2.95 2.95 0 0 0 0 -4.17 3 3 0 0 0 -4.17 0 l-5.1 5.1 a2.95 2.95 0 0 0 0 4.18 3 3 0 0 0 4.16 0 l1.42 1.41 a5 5 0 0 1 -3.5 1.45
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 11.95 19
                moveTo(x = 11.95f, y = 19.0f)
                // a 4.95 4.95 0 0 1 -3.5 -8.45
                arcToRelative(
                    a = 4.95f,
                    b = 4.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = -8.45f,
                )
                // l 5.1 -5.1
                lineToRelative(dx = 5.1f, dy = -5.1f)
                // a 4.95 4.95 0 0 1 7 7
                arcToRelative(
                    a = 4.95f,
                    b = 4.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // L 20 13
                lineTo(x = 20.0f, y = 13.0f)
                // l -1.42 -1.41
                lineToRelative(dx = -1.42f, dy = -1.41f)
                // l 0.56 -0.56
                lineToRelative(dx = 0.56f, dy = -0.56f)
                // a 2.95 2.95 0 0 0 0 -4.17
                arcToRelative(
                    a = 2.95f,
                    b = 2.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.17f,
                )
                // a 3 3 0 0 0 -4.17 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.17f,
                    dy1 = 0.0f,
                )
                // l -5.1 5.1
                lineToRelative(dx = -5.1f, dy = 5.1f)
                // a 2.95 2.95 0 0 0 0 4.18
                arcToRelative(
                    a = 2.95f,
                    b = 2.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.18f,
                )
                // a 3 3 0 0 0 4.16 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.16f,
                    dy1 = 0.0f,
                )
                // l 1.42 1.41
                lineToRelative(dx = 1.42f, dy = 1.41f)
                // a 5 5 0 0 1 -3.5 1.45
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = 1.45f,
                )
            }
            // M19.95 17 a4.95 4.95 0 0 1 -3.5 -8.45 L17 8 l1.42 1.42 -.56 .55 a2.95 2.95 0 0 0 0 4.17 3 3 0 0 0 4.17 0 l5.1 -5.1 a2.95 2.95 0 0 0 0 -4.18 3 3 0 0 0 -4.16 0 l-1.42 -1.41 a4.95 4.95 0 0 1 7 7 l-5.1 5.1 a5 5 0 0 1 -3.5 1.45
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 19.95 17
                moveTo(x = 19.95f, y = 17.0f)
                // a 4.95 4.95 0 0 1 -3.5 -8.45
                arcToRelative(
                    a = 4.95f,
                    b = 4.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = -8.45f,
                )
                // L 17 8
                lineTo(x = 17.0f, y = 8.0f)
                // l 1.42 1.42
                lineToRelative(dx = 1.42f, dy = 1.42f)
                // l -0.56 0.55
                lineToRelative(dx = -0.56f, dy = 0.55f)
                // a 2.95 2.95 0 0 0 0 4.17
                arcToRelative(
                    a = 2.95f,
                    b = 2.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = 4.17f,
                )
                // a 3 3 0 0 0 4.17 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 4.17f,
                    dy1 = 0.0f,
                )
                // l 5.1 -5.1
                lineToRelative(dx = 5.1f, dy = -5.1f)
                // a 2.95 2.95 0 0 0 0 -4.18
                arcToRelative(
                    a = 2.95f,
                    b = 2.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = 0.0f,
                    dy1 = -4.18f,
                )
                // a 3 3 0 0 0 -4.16 0
                arcToRelative(
                    a = 3.0f,
                    b = 3.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = false,
                    dx1 = -4.16f,
                    dy1 = 0.0f,
                )
                // l -1.42 -1.41
                lineToRelative(dx = -1.42f, dy = -1.41f)
                // a 4.95 4.95 0 0 1 7 7
                arcToRelative(
                    a = 4.95f,
                    b = 4.95f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = 7.0f,
                    dy1 = 7.0f,
                )
                // l -5.1 5.1
                lineToRelative(dx = -5.1f, dy = 5.1f)
                // a 5 5 0 0 1 -3.5 1.45
                arcToRelative(
                    a = 5.0f,
                    b = 5.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -3.5f,
                    dy1 = 1.45f,
                )
            }
            // M24 30 H4 a2 2 0 0 1 -2 -2 V8 a2 2 0 0 1 2 -2 h4 v2 H4 v20 h20 V18 h2 v10 a2 2 0 0 1 -2 2
            path(
                fill = SolidColor(Color(0xFF000000)),
            ) {
                // M 24 30
                moveTo(x = 24.0f, y = 30.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // a 2 2 0 0 1 -2 -2
                arcToRelative(
                    a = 2.0f,
                    b = 2.0f,
                    theta = 0.0f,
                    isMoreThanHalf = false,
                    isPositiveArc = true,
                    dx1 = -2.0f,
                    dy1 = -2.0f,
                )
                // V 8
                verticalLineTo(y = 8.0f)
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
                // v 2
                verticalLineToRelative(dy = 2.0f)
                // H 4
                horizontalLineTo(x = 4.0f)
                // v 20
                verticalLineToRelative(dy = 20.0f)
                // h 20
                horizontalLineToRelative(dx = 20.0f)
                // V 18
                verticalLineTo(y = 18.0f)
                // h 2
                horizontalLineToRelative(dx = 2.0f)
                // v 10
                verticalLineToRelative(dy = 10.0f)
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
        }.build().also { _copyLink = it }
    }

@Suppress("ObjectPropertyName")
private var _copyLink: ImageVector? = null
